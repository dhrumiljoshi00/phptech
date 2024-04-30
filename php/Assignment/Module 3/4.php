<?php

function fibonacci($limit) {
    $fibonacciSeries = array();
    $fibonacciSeries[0] = 0;
    $fibonacciSeries[1] = 1;

    for ($i = 2; $i < $limit; $i++) {
        $fibonacciSeries[$i] = $fibonacciSeries[$i - 1] + $fibonacciSeries[$i - 2];
    }

    return $fibonacciSeries;
}

$limit = 10; 

echo "Fibonacci series up to $limit numbers:\n";
$fibonacciSeries = fibonacci($limit);
echo implode(", ", $fibonacciSeries);
?>
