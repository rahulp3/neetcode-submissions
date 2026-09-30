class Solution:
    def encode(self, strs: list[str]) -> str:
        # Format: length + '#' + string
        encoded = []
        for s in strs:
            encoded.append(f"{len(s)}#{s}")
        return "".join(encoded)

    def decode(self, s: str) -> list[str]:
        res = []
        i = 0
        n = len(s)
        
        while i < n:
            # 1. Find the delimiter '#'
            delim_idx = s.find("#", i)
            
            # 2. Extract the length
            length = int(s[i:delim_idx])
            
            # 3. Read exactly `length` characters after '#'
            start = delim_idx + 1
            res.append(s[start : start + length])
            
            # 4. Advance pointer to the start of the next token
            i = start + length
            
        return res