<c:forEach items="${account}" var="account">
                  <tr>
                      <td>${account.accountId}</td>
                      <td>${account.withdrawalAmount}</td>
                      <td>${account.availableBalance}</td>
                  </tr>
                  </c:forEach>