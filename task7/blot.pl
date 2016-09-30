a(X) :- not(X=victor), X=borya.
b(X) :- X=victor, not(X=alex).
v(X) :- not(X=borya), ((X=victor);not(X=victor)).
soil(X) :- (a(X), b(X), not(v(X))).
soil(X) :- (a(X), not(b(X)), v(X)).
soil(X) :- (not(a(X)), b(X), v(X)).
               
