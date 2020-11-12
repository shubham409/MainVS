% continuous phase frequency shif keeying
clc;
close all;
clear all;
x= round(rand(1,10));
t1= 0:0.001:0.999;
s= 5*sin(2*pi*4.5*t1);
s1= 5*sin(2*pi*2*t1);
ask=[]
psk=[]
for i=1:10
	if(x(i)==1)
		ask=[ask s]
	else
		ask=[ask s1]
	end
end
subplot(2,1,1)
stairs(0:9,x)
xlabel('time');
ylabel('amplitude');
axis([0, 10, -0.2,1.2])
subplot(2,1,2);
plot(0:0.001:9.999,ask);
grid on;
title('graph')
xlabel('time');
ylabel('amplitude');


