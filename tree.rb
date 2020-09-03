
class TreeNode
    attr_accessor :val, :left, :right
    def initialize(val = 0, left = nil, right = nil)
        @val = val
        @left = left
        @right = right
    end


end

root = TreeNode.new(3)
root.left = TreeNode.new(6)
root.right = TreeNode.new(9)


