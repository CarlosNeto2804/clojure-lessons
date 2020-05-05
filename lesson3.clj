(ns course.lesson3)
(def prices [30 100 700 1000])

(println (get prices 0));30
(println (get prices 2));700


(println (inc 5)); inc -> soma 1 de um valor
(println (dec 5)); dec -> subtrai 1 de um valor

; update -> atualiza o valor de uma posição
;   sintaxe (update vetor posição para atualizar como atualiza)
;   metodo retorna uma nova coleção e não altera a original;  
(println (update prices 0 inc)) ;[31 100 700 1000]
(println prices) ;[30 100 700 1000]

;usando update com callback
(defn soma-um [value] (+ value 1))
(println (update prices 0 soma-um))

(defn aplicar-desconto? [preco-original] (> preco-original 100))

(defn preco-com-desconto [preco-original]
  (if (aplicar-desconto? preco-original)
  (let [taxa-desconto (/ 10 100)
    desconto (* preco-original  taxa-desconto)]
  (.floatValue (- preco-original desconto)))
  preco-original))

(println (map preco-com-desconto prices))

;Faz o calculo de descoto apos ter filtrado os itens que recebem o desconto
(println (map preco-com-desconto (filter aplicar-desconto?  prices )))

(println (reduce + prices))

;reduce com cb
(defn soma-cb [n1 n2] (+ n1 n2))
(println (reduce soma-cb prices))