<?php 

    class MyException extends Exception {

    }

    try {
        $a = 15;
        $b = 1;
        $c = 2;
        $s = ($a + $b + $c)/2;
        $area = sqrt($s*($s - $a)*($s - $b)*($s - $c));
        

        if($a <= 0 || $b <= 0 || $c <= 0) {
            throw new MyException("side cannot be zero.");
        }
        if($s*($s - $a)*($s - $b)*($s - $c) < 0){
            throw new MyException("S cannot be negative. enter correct sides.");
        }
        else {
            print "area = ".$area;
        }
    }
    catch(MyException $me) {
        print "problem is ".$me->getMessage();
    }
    print "hello";

?>