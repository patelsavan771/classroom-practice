<?php
    // $mat = array(array(1,2,3),
    //             array(4,5,6,),
    //             array(7,8,9));

    // for($i = 0; $i < sizeof($mat); $i++) {
    //     for($j = 0; $j < sizeof($mat[$i]); $j++) {
    //         print " ".$mat[$i][$j];
    //     }
    //     print "<br>";
    // }

    
    $mat = array(array(1,0,0),
                array(0,1,0),
                array(0,0,1));
    $flag = 1;
    for($i = 0; $i < sizeof($mat); $i++) {
        for($j = 0; $j < sizeof($mat[$i]); $j++) {
            if(($i != $j && $mat[$i][$j] != 0) || ($i == $j && $mat[$i][$j] != 1) ) {
                $flag = 0;
                break;
            }
        }
    }


    // if($flag == 0) {
    //     print "not";
    // }
    // else {
    //     print "yes";
    // }

    $flag == 0 ? print "not identical" : print "identical";

?>