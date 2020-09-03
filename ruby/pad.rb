class Node
  attr_accessor :val, :next

  def initialize(val)
    @val = val
    @next = nil
  end

  def add_node(root, node)
    curr = root
    while !curr.next.nil? do 
      curr = curr.next
    end
    curr.next = node
  end


end


head = Node.new(3)

puts head.val

head.add_node(head, Node.new(4))
puts head.next.val
