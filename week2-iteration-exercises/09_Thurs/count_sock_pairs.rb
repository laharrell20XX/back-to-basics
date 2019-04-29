def count_sock_pairs (socks)
  sorted_socks = socks.sort()
  last_sock = ''
  pair_found = false
  sorted_socks.reduce(0) do |total_sock_pairs, sock|
    if last_sock == sock
      if !pair_found
        total_sock_pairs += 1
        pair_found = true
      end
    else
      pair_found = false
    end
    
    last_sock = sock
    total_sock_pairs
  end
  
end

socks1 = ['c1','c1','c4','c3','c2','c1','c3']
puts (count_sock_pairs(socks1) == 2)
puts("Actual Result: #{count_sock_pairs(socks1)}")
