# Package structure (revision-friendly, by algorithm)

No problems are deleted. Original packages are kept; algorithm-based packages are added for easier revision.

## Algorithm-based packages (use these for revision)

| Package | Description |
|--------|-------------|
| **leetcodetop100** | LeetCode Top 100 – unchanged, primary list |
| **greedy** | Greedy algorithms (Jump Game, Assign Cookies, Can Place Flowers, etc.) |
| **binarysearch** | Binary search (Find Peak, Search in Rotated Array, First/Last Position, etc.) |
| **slidingwindowandtwopointers** | Sliding window & two pointers (Min Window Substring, Two Sum, Trapping Rain Water, etc.) |
| **prefixsum** | Prefix sum / cumulative sum (Subarray Sum Equals K, Contiguous Array, Product Except Self, etc.) |
| **general** | General / mixed problems (Two Sum, Group Anagrams, DP, strings, etc.) |
| **arrays** | Array-focused problems |
| **datastructures** | Linked lists, merge lists, cycle detection, etc. |
| **monotonicstack** | Monotonic stack (e.g. Daily Temperatures) |
| **sorting** | Sorting and related problems |
| **duplicates** | Alternate/redo implementations (e.g. prefixsum redo, same problem different solution) – nothing removed, kept here |

## Original packages (still present, no deletions)

- **problems** – original mixed set (includes **problems.greedy**)
- **prefixSum** – original prefix sum (canonical versions also in **prefixsum**)
- **prefixsumredo** – redo implementations (canonical copies in **duplicates** with *Redo* class names where needed)

## Quick revision order

1. **leetcodetop100** – core set  
2. **greedy** – greedy patterns  
3. **binarysearch** – binary search patterns  
4. **slidingwindowandtwopointers** – sliding window & two pointers  
5. **prefixsum** – prefix sum patterns  
6. **general** – rest of problems  
7. **datastructures** – linked lists & related  
8. **arrays**, **monotonicstack**, **sorting** – by topic  
9. **duplicates** – when revisiting alternate solutions  
