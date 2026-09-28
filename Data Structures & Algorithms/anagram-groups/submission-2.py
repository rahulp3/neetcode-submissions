class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}

        for str in strs:
            count = [0] * 26

            for i in str:
                idx = ord(i) - ord('a')
                count[idx] = count[idx] + 1
            
            count = tuple(count)

            if len(hashmap) == 0:
                hashmap[count] = [str]
            else:
                if count in hashmap:
                    hashmap[count].append(str)

                else:
                    hashmap[count] = [str]

        
        return list(hashmap.values())