class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []

        for i in s:
            if i in ['(', '{', '[']:
                stack.append(i)

            if i in [')', '}', ']']:
                if not stack:
                    return False

                peek_character = stack[len(stack) - 1]

                if (peek_character == '(' and i == ')') or \
                        (peek_character == '{' and i == '}') or \
                        (peek_character == '[' and i == ']'):
                    stack.pop()
                else:
                    return False

        return not stack
