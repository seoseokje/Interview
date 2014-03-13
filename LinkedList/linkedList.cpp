#include <iostream>

using namespace std;

class node {
public:
	int data;
	node * next;

	node (int _data) {
		data = _data;
		next = NULL;
	}
};


class single_linked_list {
public:
	node *head;
	node *tail;

	single_linked_list() {};
	~single_linked_list() {
		clear();
	}

	void reverse_rec() {
		tail = head;
		head = reverse_rec_help(tail, NULL);
	}

	node * reverse_rec_help(node * cursor, node * prev) {
		if (cursor == NULL) return NULL;
		node * next = cursor->next;
		cursor->next = prev;
		if (next == NULL) return cursor;
		else return reverse_rec_help(next, cursor);
	}

	void insert(int data) {
		if (head == NULL) {
			head = new node(data);
			tail = head;
		}
		else {
			tail->next = new node(data);
			tail = tail -> next;
		}
		return;
	}

	void print() {
		node * cursor = head;
		while (cursor != NULL) {
			cout << cursor->data << endl;
			cursor = cursor->next;
		}
	}

	void clear() {
		node *cursor = head;
		node *f;
		while (cursor != NULL) {
			f = cursor;
			cursor = f -> next;
			delete f;
		}
		head = tail = NULL;
	}
};

int main(int argc, char **argv) {
	single_linked_list * a = new single_linked_list();
	for (int i = 0; i < 10; i++)
		a->insert(i);
	a->print();
	a->reverse_rec();
	a->print();
	return 1;
}