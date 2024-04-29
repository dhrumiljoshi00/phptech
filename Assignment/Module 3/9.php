 1 - Indexed Array (Numeric keys):
$numericArray = array(1, 2, 3, 4, 5);

$numericArray = [1, 2, 3, 4, 5];

2 - Associative Array (String keys):

$assocArray = array("name" => "John", "age" => 30, "city" => "New York");
$assocArray = ["name" => "John", "age" => 30, "city" => "New York"];

3 Mixed Type Array:

$mixedArray = array(1, "apple", true, 3.14);

$mixedArray = [1, "apple", true, 3.14];

To convert a JSON string to an array in PHP, you can use the json_decode() function

$jsonString = '{"name": "John", "age": 30, "city": "New York"}';
$arrayFromJson = json_decode($jsonString, true);

echo $arrayFromJson["name"]; 
echo $arrayFromJson["age"];  
echo $arrayFromJson["city"];




