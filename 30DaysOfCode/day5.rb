#!/bin/ruby

$n = gets.strip.to_i
$i = 1
while ($i < 11) do
    $r = $n * $i
    puts("#$n x #$i = #$r");
    $i = $i + 1
end
