<?php

$originalArray = array(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);


$uniqueArray = array_unique($originalArray);


echo "Original Array: ";
print_r($originalArray);


echo "Array with Duplicates Removed: ";
print_r($uniqueArray);
?>
