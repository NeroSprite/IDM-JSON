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
