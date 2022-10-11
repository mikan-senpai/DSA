class node:
    def __init__(self , value , next ):
        self.value = value
        self.next = next


root = node(None ,None)

a1 = node("value1",None)

root.next=a1

a2 = node("value2",None)

a1.next=a2

a3 = node("value3",None)

a2.next=a3

def print_list(root):
    while root.next:
        print(root.value)
        root=root.next
    print(root.value)

print_list(root)