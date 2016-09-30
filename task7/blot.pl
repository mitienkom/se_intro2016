a(X) :- not(X=victor), X=borya.
b(X) :- X=victor, not(X=alex).
v(X) :- not(X=borya), ((X=victor);not(X=victor)).
soil(X) :- (a(X), b(X), (X=borya), ((X=victor), not(X=victor))).
soil(X) :- (a(X), not(X=victor), X=alex, v(X)).
soil(X) :- (X=victor, not(X=borya), b(X), v(X)).
               
