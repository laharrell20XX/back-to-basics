require 'minitest'
def largest_smallest_difference (arr)
  minmax_arr = arr.minmax
  if minmax_arr.length <= 1
    0
  else
    minmax_arr[1] - minmax_arr[0]
  end
  
end

#puts largest_smallest_difference ([10, 0, 20, 10])
#puts largest_smallest_difference ([5,5])
#puts largest_smallest_difference ([13])
#puts largest_smallest_difference ([20, 10, 0, 10])
#puts largest_smallest_difference ([1, 2, 3, 4, 5])

def largest_smallest_difference2 (arr)
 
  acc_arr = arr.reduce([arr[0],arr[0]]) do |acc_arr, elm|
    if elm < acc_arr[0]
      acc_arr[0] = elm
    elsif elm > acc_arr[1]
      acc_arr[1] = elm
    end
    acc_arr
  
  end
  acc_arr[1] - acc_arr[0]
end

puts largest_smallest_difference2 ([10, 0, 20, 10])
puts largest_smallest_difference2 ([5,5])
puts largest_smallest_difference2 ([13])
puts largest_smallest_difference2 ([20, 10, 0, 10])
puts largest_smallest_difference2 ([1, 2, 3, 4, 5])
