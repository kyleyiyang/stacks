STACK-EMPTY(S)
if S:top == 0
  return TRUE
else return FALSE
PUSH(S, x)
S.top = S.top + 1
S[S.top]= x
POP(S)
if STACK-EMPTY(S)
  error “underflow”
else S.top = S.top - 1
  return S[S.top + 1]
