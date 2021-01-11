#include <iostream>
using namespace std;
int main() {
  int r,s;
  cin>>r>>s;
  if (-1000<=s && s<=1000 && -1000<=r && r<=1000)
    cout<<(s*2-r);
}