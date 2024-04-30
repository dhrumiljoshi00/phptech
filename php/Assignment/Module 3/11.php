<?php

$myArray = array("apple", "banana", "cherry", "date", "elderberry");


$randomKey = array_rand($myArray);


$randomValue = $myArray[$randomKey];


echo "Random value: " . $randomValue;
?>
