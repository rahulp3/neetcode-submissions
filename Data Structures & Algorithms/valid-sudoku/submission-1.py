class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = len(board)
        cols = len(board[0])
        rows_lst = [[False for _ in range(cols)] for _ in range(rows)]
        cols_lst = [[False for _ in range(cols)] for _ in range(rows)]
        boxes_lst = [[False for _ in range(cols)] for _ in range(rows)]

        for i in range(rows):
            for j in range(cols):
                current = board[i][j]

                if current == '.':
                    continue

                index = int(current) - 1
                box_index = ((i // 3) * 3) + (j // 3)

                if(rows_lst[i][index] or cols_lst[j][index] or boxes_lst[box_index][index]):
                    return False

                rows_lst[i][index] = True
                cols_lst[j][index] = True
                boxes_lst[box_index][index] = True

        return True
        