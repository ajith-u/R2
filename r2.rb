r,s=gets.chomp.split.map(&:to_i)
if s.between?(-1000,1000) and r.between?(-1000,1000)
  puts (s*2)-r
end
