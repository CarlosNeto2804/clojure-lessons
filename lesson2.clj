(ns course.lesson2)

(println "Bem vindo ao sistema de vendas!")

; def-> declara uma variavel em escopo global
; sintaxe (def nome-variavel valor)
(def total-de-produtos 15)
(println "Total de Produtos Disponiveis "  total-de-produtos)

; vetores são representados por []
; os itens não são separados por virgula ex: ["a" "b" "c"]
(def vetor-de-produtos ["Mochila" "Camiseta" "Sapato" "Calça"])

; conj -> método que retorna uma nova coleção com novos elementos concatenados
; não alterando a coleção original
; sintaxe (conj colecao novo-valor)
; (def vetor-numeros [1 2 3 4])
; (printf (vetor-numeros)) ; saida -> [1 2 3 4]
; (printf (conj vetor-numeros 5)); saida [1 2 3 4 5]
; (printf (vetor-numeros)) ; saida -> [1 2 3 4]
(conj vetor-de-produtos "Meia")

; defn -> declara uma função
; sintaxe: (defn nome-funcao "Descrição opcional da funçao" [parametros] corpo)
(defn print-message "Imprime boas vindas" [] 
    (println "-----------------")
    (println "Bem vindo a loja!"))

(defn aplicar-desconto "Retorna o valor com 90% de desconto" [preco-original]
    (* preco-original 0.9))

(defn aplicar-desconto-dinamico [preco-original desconto]
    (if (> preco-original 100)
    (let [porcentagem  (/ desconto 100)
        valor-desconto (* porcentagem preco-original)]
        (- preco-original valor-desconto))
        preco-original))

(def valor-com-desconto-1 (aplicar-desconto-dinamico 200 10))
(def valor-com-desconto-2 (aplicar-desconto-dinamico 50 10))

(println (.floatValue valor-com-desconto-1))
(println (.floatValue valor-com-desconto-2))