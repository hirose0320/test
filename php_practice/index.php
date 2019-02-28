
<?php
$food =array(
"vegetable"=>array("carrot"=>"にんじん",
            "tomato"=>"トマト",
            "onion"=>"たまねぎ"
                  ),
 "fruit" => array("apple"=>"りんご",
              "orange"=>"オレンジ",
              "grape"=>"ぶどう"));

foreach($food as $g => $n){
    echo "■".$g."<br>";
    foreach($n as $e=>$i){
        echo $e.":".$i."<br>";
    }
    echo"<br>";
}
    ?>