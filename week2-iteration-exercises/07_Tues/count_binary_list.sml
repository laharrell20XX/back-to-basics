fun is_truthy_list (binary_arr) =
    let fun helper (binary_arr, numOnes, numZeroes) =
	    case binary_arr of
		[] => if   numOnes > numZeroes
		      then true
		      else false
	      | head :: tail => if   head = 1
				then helper (tail, (numOnes + 1), numZeroes)
				else if head = 0
				then helper (tail, numOnes, numZeroes + 1) 
				else helper (tail, numOnes, numZeroes)
    in
	helper(binary_arr, 0, 0)
    end
	
				
			    
