def collect_num
  print "Please enter a positive integer: "
  gets.chomp
end

def display_evens_odds
  num = [1, collect_num.to_i - 1].max

  # creates range object between 1 and up to the integer
  # runs specified block on each integer
  if num != 1
    
    (1..num).each do |num|
      even_or_odd = if num % 2 == 0
                      "even"
                    else
                      "odd"
                    end
    
      puts "#{num}: #{even_or_odd}"

    end
  end
  
end

display_evens_odds
