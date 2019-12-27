public boolean catDog(String str) {
  int c=0,d=0;
  for(int i=0;i<str.length()-2;i++)
  {
    if(str.substring(i,i+3).equals("cat"))c++;
    if(str.substring(i,i+3).equals("dog"))d++;
  }
  if(c==d)
  return true;
  else
  return false;
}
