clc;
close all;
clear all;
x= round(rand(1,10));
t1= 0:0.001:0.999;
s= 5*sin(2*pi*2*t1);
s1= sin(2*pi*2*t1);
ask=[]
for i=1:10
	if(x(i)==1)
		ask=[ask s]
	else
		ask=[ask s1]
	end
end
subplot(2,1,1)
stairs(0:9,x)
subplot(2,1,2);
plot(0:0.001:9.999,ask);



close ;
clear ;
x=round (rand (1,10) );
t1 = 0:0.001:0.999 ;
s=5*sin(2*pi*2*t1);
sl=sin(2*pi*2*t1);
ask = []
for i=1:10
    if (x (i) ==1)
    ask = [ask s]
    else
    ask = [ask zeros(1,1000) ]
    end
end
subplot (2,1,1)
stairs (0:9, x)
axis ([0, 10, -0.2,1.2]) 
subplot (2,1,2) ;
plot (0:0.001:9.999, ask) ; 






















