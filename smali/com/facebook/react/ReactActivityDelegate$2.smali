.class Lcom/facebook/react/ReactActivityDelegate$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/ReactActivityDelegate;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/ReactActivityDelegate;

.field final synthetic val$grantResults:[I

.field final synthetic val$permissions:[Ljava/lang/String;

.field final synthetic val$requestCode:I


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactActivityDelegate;I[Ljava/lang/String;[I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactActivityDelegate$2;->this$0:Lcom/facebook/react/ReactActivityDelegate;

    iput p2, p0, Lcom/facebook/react/ReactActivityDelegate$2;->val$requestCode:I

    iput-object p3, p0, Lcom/facebook/react/ReactActivityDelegate$2;->val$permissions:[Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/ReactActivityDelegate$2;->val$grantResults:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs invoke([Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/ReactActivityDelegate$2;->this$0:Lcom/facebook/react/ReactActivityDelegate;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/react/ReactActivityDelegate;->access$000(Lcom/facebook/react/ReactActivityDelegate;)Lcom/facebook/react/modules/core/PermissionListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/facebook/react/ReactActivityDelegate$2;->this$0:Lcom/facebook/react/ReactActivityDelegate;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/ReactActivityDelegate;->access$000(Lcom/facebook/react/ReactActivityDelegate;)Lcom/facebook/react/modules/core/PermissionListener;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget v0, p0, Lcom/facebook/react/ReactActivityDelegate$2;->val$requestCode:I

    .line 16
    .line 17
    iget-object v1, p0, Lcom/facebook/react/ReactActivityDelegate$2;->val$permissions:[Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/react/ReactActivityDelegate$2;->val$grantResults:[I

    .line 20
    .line 21
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/modules/core/PermissionListener;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/facebook/react/ReactActivityDelegate$2;->this$0:Lcom/facebook/react/ReactActivityDelegate;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p1, v0}, Lcom/facebook/react/ReactActivityDelegate;->access$002(Lcom/facebook/react/ReactActivityDelegate;Lcom/facebook/react/modules/core/PermissionListener;)Lcom/facebook/react/modules/core/PermissionListener;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method
