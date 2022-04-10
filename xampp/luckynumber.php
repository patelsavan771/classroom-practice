<?php

    $n = 777;
    $sum = $n;

    while($sum > 9) {
        $n = $sum;
        $sum = 0;
        while($n > 0) {
            $sum += $n % 10;
            $n /= 10;
        }
    }
    if($sum == 1) {
        print "lucky";
    }
    else {
        print "not";
    }

    // while($n > 0) {
    //     $sum += $n % 10;
    //     $n /= 10;
    // }
    // while($sum > 9) {
    //     $n = $sum;
    //     $sum = 0;
    //     while($n > 0) {
    //         $sum += $n % 10;
    //         $n /= 10;
    //     }
    // }

?>