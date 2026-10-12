class Solution:
    def isValid(self, s: str) -> bool:
        st = []

        for ch in s:
            if st and self.is_pair(st[-1], ch):
                st.pop()
                continue
            st.append(ch)

        return not st

    def is_pair(self, l, cur):
        return (l == '(' and cur == ')') or \
               (l == '{' and cur == '}') or \
               (l == '[' and cur == ']')