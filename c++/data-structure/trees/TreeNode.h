#include <vector>
using namespace std;


template <typename T>
class TreeNode{
    public:
        T data ;
        vector<TreeNode*> children ;

    TreeNode(T data)
    {
        this-> data=data ;
    }

};