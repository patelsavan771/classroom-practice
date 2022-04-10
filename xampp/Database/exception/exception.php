<?php 

    class ArithmeticException extends Exception {

    }

    try {
        $a = 5;
        $b = 2;
        if($b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        else {
            print $a/$b;
        }
    }
    catch(ArithmeticException $ae) {
        print "problem is ".$ae->getMessage();
    }
    print "hello";

?>