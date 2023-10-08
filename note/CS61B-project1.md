# CS61B-project1

## Project 1A: Data Structures

在此项目中我们将使用列表和数组实现`Double ended Queue`。

在这一部分我们将创造两个Java文件：`LinkedListDeque.java`和`ArrayDeque.java`。不像project0中那样, 我们将会告诉你应该怎么做但不会告诉你如何去做.

### 得到骨架文件

首先应该得到骨架文件. 

```bash
git pull skeleton master
```

在骨架中仅仅5提供了一个文件`LinkedListDequeTest.java`, 这个文件向你展示了你可能需要去验证你代码的准确性. 我们强烈建议您尝试给定的测试，并至少编写一个您自己的测试。您可能会发现编写测试非常烦人。然而，在这个项目的 B 部分中，我们将使用一个名为 JUnit 的库，这将使编写测试变得更加容易和有组织。我们将在后面的部分中详细讨论测试。

### Deque API

双端队列与单链表和数组链表是很相似的, 这里有个关于此的定于[cplusplus.com](http://www.cplusplus.com/reference/deque/deque/).

Deque（通常发音为“deck”）是双端队列的不规则缩写。双端队列是具有动态大小的序列容器，可以在两端（前端或后端）扩展或收缩。

具体来说，任何双端队列实现都必须具有以下操作：

- `public void addFirst(T item)`：将类型的项添加`T`到双端队列的前面。
- `public void addLast(T item)`：将类型的项添加`T`到双端队列的后面。
- `public boolean isEmpty()`：如果 deque 为空则返回 true，否则返回 false。
- `public int size()`：返回双端队列中的项目数。
- `public void printDeque()`：从第一个到最后一个打印双端队列中的项目，以空格分隔。
- `public T removeFirst()`：删除并返回双端队列前面的项目。如果不存在这样的项目，则返回 null。
- `public T removeLast()`：删除并返回双端队列后面的项目。如果不存在这样的项目，则返回 null。
- `public T get(int index)`：获取给定索引处的项目，其中 0 是前面的项目，1 是下一个项目，依此类推。如果不存在这样的项目，则返回 null。一定不能改变双端队列！

您的类应该接受任何泛型类型（不仅仅是整数）.

### 项目任务

