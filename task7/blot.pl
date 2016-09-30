a(X) :- not(X=victor), X=borya.
b(X) :- X=victor, not(X=alex).
v(X) :- not(X=borya), ((X=victor);not(X=victor)).
запачкал(X) :- (a(X), b(X), not(v(X))).
запачкал(X) :- (a(X), not(b(X)), v(X)).
запачкал(X) :- (not(a(X)), b(X), v(X)).
               
