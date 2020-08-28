import uiautomation as auto
import time
ths = auto.WindowControl(Name='网上股票交易系统5.0')
buy = ths.TreeItemControl(Name='撤单[F3]')
buy.Click()
table =ths.PaneControl(ClassName='CVirtualGridCtrl',Name='Custom1')
table.RightClick()
auto.SendKeys('{DOWN}')
auto.SendKeys('{DOWN}')
auto.SendKeys('{DOWN}')
auto.SendKeys('{ENTER}')
print(auto.GetClipboardText())
