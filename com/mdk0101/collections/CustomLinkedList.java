package com.mdk0101.collections;

import java.util.Iterator;

public class CustomLinkedList<Type> implements Iterable<Type>{
    private Node<Type> _first;
    private Node<Type> _last;

    private Integer _size = 0;
    public void pushBack(Type element){
        if(_first == null) {
            _first = new Node<Type>(null, null, element);
            _last = _first;
        }else{
            Node<Type> node = new Node<>(_last, null, element);
            _last.setNext(node);
            _last = node;
        }
        _size++;
    }
    public void pushUp(Type element){
        if(_first == null) {
            _first = new Node<Type>(null, null, element);
            _last = _first;
        }else{
            Node<Type> node = new Node<>(null, _first, element);
            _first.setPrevious(node);
            _first = node;
        }
        _size++;
    }

    public Type get(Integer index) throws ArrayIndexOutOfBoundsException{
        Node<Type> currentElement = _first;
        for (int i = 0; i < index; i++) {
            if(currentElement.getNext() == null) throw new ArrayIndexOutOfBoundsException("Дальше бога нет");
            currentElement = currentElement.getNext();
        }
        return currentElement.getElement();
    }

    public void pop(Integer index){
        if(index == 0){
            _first = _first.getNext();
            _first.setPrevious(null);
        } else if (index == _size-1) {
            _last = _last.getPrevious();
            _last.setNext(null);
        }
        else{
            Node<Type> currentElement = _first;
            for (int i = 0; i < index; i++) {
                if(currentElement.getNext() == null) throw new ArrayIndexOutOfBoundsException("Дальше бога нет");
                currentElement = currentElement.getNext();
            }
            currentElement.getPrevious().setNext(currentElement.getNext());
            currentElement.getNext().setPrevious(currentElement.getPrevious());
        }
        _size--;
    }



    public Type first(){
        return _first.getElement();
    }

    public Type last(){
        return _last.getElement();
    }

    public Integer size() {
        return _size;
    }

    @Override
    public Iterator<Type> iterator() {
        return new Iterator<Type>() {
            private Node<Type> currentElement = _first;
            @Override
            public boolean hasNext() {
                return currentElement != null;
            }
            @Override
            public Type next() {
                Node<Type> temp = currentElement;
                currentElement = currentElement.getNext();
                return temp.getElement();
            }
        };
    }
    private static class Node<Type>{
        private Type _element;
        private Node<Type> _previous;
        private Node<Type> _next;

        public Type getElement() {
            return _element;
        }

        public void setElement(Type element) {
            _element = element;
        }

        public Node<Type> getPrevious() {
            return _previous;
        }

        public void setPrevious(Node<Type> previous) {
            _previous = previous;
        }

        public Node<Type> getNext() {
            return _next;
        }

        public void setNext(Node<Type> next) {
            _next = next;
        }

        public Node(Node<Type> previous, Node<Type> next, Type element){
            _previous = previous;
            _next = next;
            _element = element;
        }
    }
}
