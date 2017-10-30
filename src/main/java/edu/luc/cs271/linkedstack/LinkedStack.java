package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    top = new Node<>(obj, top);
    return obj;
  }

  @Override
  public E peek() {
    // TODO

    if (isEmpty() == true) {
      throw new NoSuchElementException();

    } else {
      return top.data;
    }
  }

  @Override
  public E pop() {
    // TODO

    if (isEmpty() == true) {
      throw new NoSuchElementException();

    } else {
      E result = top.data;
      top = top.next;
      return result;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (top == null) {
      return true;
    }
    if (top != null) {
      return false;
    }
    return false;
  }

  @Override
  public List<E> asList() {
   final ArrayList<E> result = new ArrayList<>(size);
  populateList(this.top, result); // TODO replace null with the right reference does that fix it?
  return result;
    }
  

	private void populateList(final Node<E> curr, final List<E> result) {
  	// TODO recursively populate the list in the desired order !!!maybe this works
		if(curr == null)
			return;
		if(curr != null){
			result.add(curr);
		}
		populateList(curr.next, result);
	}

	@Override
	public List<E> asFifoList() {
  	final ArrayList<E> result = new ArrayList<>(size);
  	populateFifoList(this.top, result); // TODO replace null with the right reference 
  	return result;
	}
	
	
	private void populateFifoList(final Node<E> curr, final List<E> result) {
  	// TODO recursively populate the list in the desired order
		
		if(curr == null)
		{
			return;
		}
		if(curr != null){
			result.add(curr, size);
		}
		
		populateFifoList(curr.next, result); 
	
	}
}
