class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> ans=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
            ans.clear();
        
        }


        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.')
                {
                    if (!ans.add(board[j][i])) {
                        return false;
                    }

                }

            }
            ans.clear();
        }







        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }
        ans.clear();


        
        for(int i=0;i<3;i++)
        {
            for(int j=3;j<6;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }

        ans.clear();



        
        for(int i=0;i<3;i++)
        {
            for(int j=6;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }

        ans.clear();


        for(int i=3;i<6;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }
        ans.clear();


        
        for(int i=3;i<6;i++)
        {
            for(int j=3;j<6;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }

        ans.clear();



        
        for(int i=3;i<6;i++)
        {
            for(int j=6;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }

        ans.clear();


        for(int i=6;i<9;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }
        ans.clear();


        
        for(int i=6;i<9;i++)
        {
            for(int j=3;j<6;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }

        ans.clear();



        
        for(int i=6;i<9;i++)
        {
            for(int j=6;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if (!ans.add(board[i][j])) {
                        return false;
                    }

                }

            }
        }



        return true;
        
    }
}