a(X) :- not(X=victor).
al(X) :- X=borya.
b(X) :- X=victor.
br(X) :- not(X=alex).
v(X) :- not(X=borya).
vc(X) :- not(not(X=victor)).
soil(X) :- (a(X), al(X), b(X), br(X), not(v(X)), not(vc(X))).
soil(X) :- (a(X), al(X), not(b(X)), not(br(X)), v(X), vc(X)).
soil(X) :- (not(a(X)), not(al(X)), b(X), br(X), v(X), vc(X)).
               
