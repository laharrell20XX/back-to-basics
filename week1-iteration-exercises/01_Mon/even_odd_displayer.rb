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

def display_evens_odds2
  num = [0, collect_num.to_i - 1].max
  even_odd_arr = ["even", "odd"]
  # will take even_odd_arr, and num
  # then call even_odd_arr[num % 2] to get "even" or "odd"
  
  num_arr = Array.new(num) { |index| index }
  for num in num_arr
    num += 1
    even_or_odd = even_odd_arr[num % 2]
    puts "#{num}: #{even_or_odd}"
  end
  
end

# display_evens_odds
display_evens_odds2
