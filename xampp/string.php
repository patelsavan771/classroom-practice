<?php
    // header("location:https://www.google.com");

    $s = "hello";
    $l = strlen($s);
    print "length = ".strlen($s);
    printf ("<br>length of %s = %d",$s,$l);

    $s1 = "Hello";
    $s2 = "hello";

    print "<br>cmp : ".strcmp($s, $s2);
    print "<br>cmp : ".strcmp($s, $s1);

    print "<br>Lower : ".strtolower($s1);
    print "<br>Upper : ".strtoupper($s);

    $s3 = "this is demo.";

    print "<br>strrev : ".strrev($s);
    print "<br>strpos : ".strpos($s3, "is");
    print "<br>strrpos : ".strrpos($s3, "is");

?>
<!-- length = 5
length of hello = 5
cmp : 0
cmp : 1
Lower : hello
Upper : HELLO
strrev : olleh
strpos : 2
strrpos : 5 -->