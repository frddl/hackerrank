s = gets.chomp
c = s.split(" ")

def abbr?(word)
    word.length == 2 or ["Dr.", "Mr.", "Mrs."].include?(word)  
end

quote = false
c.each do |w|
        print w + " "
        quote = w.start_with?("\"") ? true : w.end_with?("\"") ? false : quote;
        if quote then next end
        if w.end_with?("?") || w.end_with?("!") || (w.end_with?(".") && !abbr?(w)) then print "\n" end
end
