#  Compte Rendu du TP projet de IDM
###### GUIBERT Thomas, BOUGMA Cecile, DEGAS Antoine et PAYS Matthieu
## But du TP
Le but de ce projet est dans un premier temps de créer une grammaire pour des fichiers et des commande Json en se basant sur le métamodel crée précédemment.
Ensuite dans un second temps le but était de crée deux compilateur qui genere le code en Java et en JQ, c'est deux code sont ensuite compiler et executé.
## Lien du git du MetaModel
Voici le lien pour accéder au tout premier TP, celui qui décrivait le métamodel qui a servie de base pour ce projet
Lien du Git : https://github.com/CecilebougmaIstic/TP1IDM
## Choix des compilateur
Nous avons choisi de faire un compilateur Java, ainsi qu'un compilateur JQ.
## Descriptif des different fichier important
- Un fichier de la grammaire pour un fichier JSon (Emplacement : org.xtext.example.mydsl/src/org/xtext/example/mydsl)
- JavaCompiler.java et BashCompiler2.java sont respectivement les compilateurs Java et JQ (Emplacement : org.xtext.example.mydsl.tests/src/org/xtext/example/mydsl/tests)
- MyDslParsingTest.xtend le fichier de test pour generer la compilation Java et JQ (Emplacement : org.xtext.example.mydsl.tests/src/org/xtext/example/mydsl/tests)
- Java.java et exampleBash.sh, les fichiers ou qui contiennent la generation en Java ou en JQ (Emplacement : org.xtext.example.mydsl.tests)
## Comment lancer le programme ?
Pour lancer le programme, il suffit d'écrire un code JSON en respectant la grammaire écrite dans le fichier "MyDslParsingTest" (Qui se trouve à l'emplacement suivant : org.xtext.example.mydsl.tests/src/org/xtext/example/mydsl/tests)
Après ce fichier JSon, il faut mettre les vérifications du Json donnée ainsi que l'appel aux deux compilateurs.
```Java
Assertions.assertNotNull(result)
val errors = result.eResource.errors
Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	
val BashCompiler2 cmpBash = new BashCompiler2(result)
cmpBash.compileAndRun
val JavaCompiler cmpJava = new JavaCompiler(result)
cmpJava.compileAndRun
```
Attention : il sera peut-être nécessaire de recréer des dossiers Xtend-gen ou src
## Exemple de résultat obtenu
Voici un exemple de génération, pour l'exemple suivant :
```JAVA

	@Test
	def void Array2Test() {
		val result = parseHelper.parse("JSonFile \"File\" {
			JSonArray \"MyArray\" {
				Integer \"MyInteger\" 2  ,
				Integer \"MyInteger2\" 5 ,
				Boolean \"MyBoolean\" false ,
				Null \"MyNullObject\",
				JSonArray \"MyArray2\" {
					Integer \"integ1\" 2 ,
					JSonArray \"MyArray3\" {
						Integer \"integ2\" 2 ,
						Sum\"sum\"[
							Integer \"sum1\" 1,
							Integer \"sum2\" 5,
							Div\"divi\"[
								Integer \"divi1\" 1,
								Integer \"divi2\" 5
							],
							Mult\"multi\"[
								Integer \"mult1\" 1,
								Integer \"mult2\" 5,
								Integer \"mult3\" 2
							]
						]
					}
				}
			}
		},
		Commandes {
			Display {
				jsonfileName \"File\"
			}
		},
		Commandes {
			Subset {
				arrayName \"MyArray\",
				keyName \"integ1\",\"integ2\"
			}
		},
		Commandes {
			Insert {
				targetNode \"MyArray\",
				nameObject \"integ1\"
			}
		},
		Commandes {
			Modify {
				targetNode \"MyArray\",
				nameObjectRemove \"integ1\",
				nameObject \"integ2\"
			}
		},
		Commandes {
			Remove {
				targetNode \"MyArray\",
				nameObjectRemove \"integ2\"
			}
		},
		Commandes {
			Load {
				path \"/home/thomas/Téléchargements\",
				name \"test\"
			}
		},
		Commandes {
			Store {
				path \"/home/thomas/Téléchargements\",
				name \"test\",
				contenu \"File\"
			}
		}");
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
		val JavaCompiler cmpJava = new JavaCompiler(result)
		cmpJava.compileAndRun
		val BashCompiler2 cmpBash = new BashCompiler2(result)
		cmpBash.compileAndRun
	}
```

Voici le resultat generer en Java :

```JAVA
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Java {
	public static void main(String args[]) {
		JSONObject File = new JSONObject(); 
		JSONArray MyArray = new JSONArray(); 
		JSONObject MyInteger= new JSONObject().put("MyInteger", new Double(2)); 
		MyArray.put(MyInteger); 
		JSONObject MyInteger2= new JSONObject().put("MyInteger2", new Double(5)); 
		MyArray.put(MyInteger2); 
		JSONObject MyBoolean= new JSONObject().put("MyBoolean", new Boolean(false)); 
		MyArray.put(MyBoolean); 
		JSONObject MyNullObject= new JSONObject().put("MyNullObject", "null"); 
		MyArray.put(MyNullObject); 
		JSONArray MyArray2 = new JSONArray(); 
		JSONObject integ1= new JSONObject().put("integ1", new Double(2)); 
		MyArray2.put(integ1); 
		JSONArray MyArray3 = new JSONArray(); 
		JSONObject integ2= new JSONObject().put("integ2", new Double(2)); 
		MyArray3.put(integ2); 
		JSONObject sum= new JSONObject().put("sum", new Double(1+5+(1/5)+(1*5*2))); 
		MyArray3.put(sum); 
		MyArray2.put(MyArray3); 
		MyArray.put(MyArray2); 
		File.put("MyArray",MyArray); 
		System.out.println(File); 
		//Subset 
		JSONObject search0 = new JSONObject(); 
		for(int i=0;i<MyArray.length();i++) {
			JSONObject jsonObj0 = MyArray.getJSONObject(i);
			String k0 = jsonObj0.keys().next();
			if("integ1".equals(k0)) {
				search0.put(k0, jsonObj0.getString(k0));
			}
		}
		for(int i=0;i<MyArray.length();i++) {
			JSONObject jsonObj0 = MyArray.getJSONObject(i);
			String k0 = jsonObj0.keys().next();
			if("integ2".equals(k0)) {
				search0.put(k0, jsonObj0.getString(k0));
			}
		}
		//Insert 
		MyArray.put(integ1); 
		//Modify 
		int index1 = 0; 
		for(int i=0;i<MyArray.length();i++) {
			if(integ1.equals(MyArray.get(i))) {
				index1 = i;
			}
		}
		MyArray.remove(index1); 
		MyArray.put(integ2); 
		//Remove 
		int index2 = 0; 
		for(int i=0;i<MyArray.length();i++) {
			if(integ2.equals(MyArray.get(i))) {
				index2 = i;
			}
		}
		MyArray.remove(index2); 
		try {
			JSONParser parser = new JSONParser();
			Object pasertest = parser.parse(new FileReader( "/home/thomas/Téléchargements/test.json"));
			JSONObject test =  (JSONObject) pasertest;
		} catch (Exception io) {
			io.getMessage();
		}
		try {
			String pathtest ="/home/thomas/Téléchargements/test.json";
			FileWriter filetest = new FileWriter(pathtest);
			String jsontest = File.toString();
			filetest.write(jsontest);
			filetest.close();
		} catch (IOException io) {
			io.getMessage();
		}
	}
}
```

Et voici enfin la génération avec le compilateur JQ

```Shell
File='{
	 "MyArray": {
		"MyInteger" : 2 ,
		"MyInteger2" : 5 ,
		"MyBoolean" : false ,
		"MyNullObject" : null ,
		"MyArray2": {
 			"integ1" : 2 ,
			"MyArray3": {
 				"integ2" : 2 ,
				"sum" : (1+5+(1/5)+(1*5*2))
			}

		}
	}
}'
echo "$File" 
echo "$MyArray" | jq '.integ1'
echo "$MyArray" | jq '.integ2'
MyArray="$MyArray $integ1"
MyArray="$integ2"
MyArray=""
test=$(cat /home/thomas/Téléchargements/test.json)
echo "$File" >> /home/thomas/Téléchargements/test.json

```
