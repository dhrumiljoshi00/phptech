<?php
function isArmstrong($num) {
    $numStr = (string)$num;
    $numDigits = strlen($numStr);
    $armstrongSum = 0;
    
  
    for ($i = 0; $i < $numDigits; $i++) {
        $digit = (int)$numStr[$i];
        $armstrongSum += $digit ** $numDigits;
    }
    
   
    return $armstrongSum == $num;
}

function printFormat() {
   
    echo "5 9\n";
    for ($i = 1; $i <= 4; $i++) {
        echo "$i         " . ($i + 2609) . "\n";
    }
}


$number = readline("Enter a number to check if it's Armstrong: ");
if (isArmstrong($number)) {
    echo "$number is an Armstrong number.\n";
} else {
    echo "$number is not an Armstrong number.\n";
}


echo "\nPrinting the format:\n";
printFormat();
?>
