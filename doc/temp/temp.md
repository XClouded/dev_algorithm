未分类
====================

### 数据分离
  - 例如：求水仙花数（一个三位数，其各位数字的立方和等于该数本身）
  - 分析 
  	- 分离三位数的百位：a=s/100;
  	- 分离三位数的十位：b=s/10%10;
  	- 分离三位数的个位：c=s%10;
  	- if(s==a*a*a+b*b*b+c*c*c)输出s的值

程序如下
```c
main( )
{
  int  s,a,b,c;
  for(s=100;s<=999;s++)
	   { 
	   	  a=s/100;   //（百位）
	      b=s/10%10; //（十位）
	      c=s%10;    //（个位）
	      if(s==a*a*a+b*b*b+c*c*c)  
	      printf("%4d",s);
	    }
}
```

### 辗转相除
  - 例：求两个整数u,v的最大公约数
  - 辗转相除法
  - 分析：
	- 若u>v，用u除以v求余数temp
	- 若temp==0，则v为最大公约数；若temp!=0，将u=v;v=temp，继续用u除以v，求余数temp;
	- 直至temp= =0，v为最大公约数
程序如下：
```c
main( )
{
	int  u,v,temp;
	scanf("%d%d",&u,&v);
    while(v!=0)
    { 
    	temp=u%v;
        u=v;
        v=temp;
    }
    printf("gcd=%d\n",u);
}
```

### Fibonacci
求费波那西(Fibonacci)数列的前40个数。这个数列有如下特点：第1、2两个数为1、1。从第3个数开始，该数是其前面两个数之和。即:
F1 = 1 (n=1)
F2 = 1 (n=2)
F(n)=F(n-1)+F(n-2) (n>=3)

CodeDemo
```c
#include <stdio.h>
int main()
 { 
 	int f1=1,f2=1,f3;
 	int i;
    printf("%12d\n%12d\n",f1,f2);
    for(i=1; i<=38; i++)
    {  
    	f3=f1+f2;
	    printf("%12d\n",f3);
	    f1=f2;
	    f2=f3;
    }
    return 0;
}
```

### 穷举法
通过循环对问题的所有可能状态一一测试，直到找到解或将全部可能状态都测试过为止。
例如：求100～150之间的全部素数。
```c
#include <stdio.h>
#include <math.h>
main( )
{   
	int n,i,k;
    for(n=101;n<150;n=n+2)
    {   
    	k=sqrt(n);
        for(i=3;i<=k;i=i+2)
        {
        	if(n%i==0)
        	{
				break;
        	}   	
    	}         	
        if(i>k) //一直把上面的for循环走遍了那么i就会>k    
        {
			printf("%d   ",n);
    	}  
    }
}
```

