;Evan Higgins
;19282508

#lang racket

; my code looks at a list of data and returns all numeric entries in a specific order
;;excluding duplicate numbers and negative numbers

(define testElements '(9 -5 14 2.5 7 10 "Carlsen" 14 -16 11 64 912 2001 "Ivanchuk" 2.5 -2 1 3 "Nakamura" 7 1 19 9 10 12))
                        
;Function to get numbers from the list
(define getNums (lambda(x)(if (number? x) x #f)))

;;Function to get positive numbers, used with getNums
(define posNums (lambda(n)(if( > n 0) n #f)))

;;Function to get strings from the list
(define getStrings(lambda(s)(if(string? s)s #f)))

;;Function to get negative numbers, used with getNums
(define negNums(lambda (n)(if(< n 0) n #f)))

;;Function using the "remove-duplicates" call, to remove duplicate values from the output
(define rmvDups(lambda(x)(remove-duplicates x)))

;;Use of getNums function, to remove non-numeric values from the output
(map getNums testElements)

;;Use of posNums, to remove negative integers from the getNums output, also cleaning up the #f outputs from the non-numeric values
(map posNums(filter identity(map getNums testElements)))

;;Use of rmvDups, removing any duplicate numbers from our overall output,
;;and cleaning up the #f outputs from the non-positive values
(rmvDups(filter identity(map posNums(filter identity(map getNums testElements)))))

;;Use of getStrings to produce only strings within testElements, and cleaning up any potential #f outputs
(filter identity(map getStrings testElements))

;;Use of negNums to produce only negative numbers within testElements, cleaning up output
(filter identity(map negNums(filter identity( map getNums testElements))))










                 

