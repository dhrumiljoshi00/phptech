<?php

function findLargest($num1, $num2, $num3) {
    $largest = ($num1 >= $num2) ? ($num1 >= $num3 ? $num1 : $num3) : ($num2 >= $num3 ? $num2 : $num3);
    return $largest;
}

$num1 = 10;
$num2 = 20;
$num3 = 15;

$largest = findLargest($num1, $num2, $num3);
echo "The largest number among $num1, $num2, and $num3 is: $largest";
?>
