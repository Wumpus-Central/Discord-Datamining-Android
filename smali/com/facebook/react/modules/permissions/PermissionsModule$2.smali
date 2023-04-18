.class Lcom/facebook/react/modules/permissions/PermissionsModule$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/permissions/PermissionsModule;->requestMultiplePermissions(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/permissions/PermissionsModule;

.field final synthetic val$grantedPermissions:Lcom/facebook/react/bridge/WritableMap;

.field final synthetic val$permissionsToCheck:Ljava/util/ArrayList;

.field final synthetic val$promise:Lcom/facebook/react/bridge/Promise;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/permissions/PermissionsModule;Ljava/util/ArrayList;Lcom/facebook/react/bridge/WritableMap;Lcom/facebook/react/bridge/Promise;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->this$0:Lcom/facebook/react/modules/permissions/PermissionsModule;

    iput-object p2, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$permissionsToCheck:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$grantedPermissions:Lcom/facebook/react/bridge/WritableMap;

    iput-object p4, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$promise:Lcom/facebook/react/bridge/Promise;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs invoke([Ljava/lang/Object;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v1, p1, v0

    .line 3
    .line 4
    check-cast v1, [I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aget-object p1, p1, v2

    .line 8
    .line 9
    check-cast p1, Lcom/facebook/react/modules/core/PermissionAwareActivity;

    .line 10
    .line 11
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$permissionsToCheck:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v0, v2, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$permissionsToCheck:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    array-length v3, v1

    .line 28
    if-lez v3, :cond_0

    .line 29
    .line 30
    aget v3, v1, v0

    .line 31
    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    iget-object v3, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$grantedPermissions:Lcom/facebook/react/bridge/WritableMap;

    .line 35
    .line 36
    const-string v4, "granted"

    .line 37
    .line 38
    invoke-interface {v3, v2, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-interface {p1, v2}, Lcom/facebook/react/modules/core/PermissionAwareActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v3, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$grantedPermissions:Lcom/facebook/react/bridge/WritableMap;

    .line 49
    .line 50
    const-string v4, "denied"

    .line 51
    .line 52
    invoke-interface {v3, v2, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget-object v3, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$grantedPermissions:Lcom/facebook/react/bridge/WritableMap;

    .line 57
    .line 58
    const-string v4, "never_ask_again"

    .line 59
    .line 60
    invoke-interface {v3, v2, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$promise:Lcom/facebook/react/bridge/Promise;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$2;->val$grantedPermissions:Lcom/facebook/react/bridge/WritableMap;

    .line 69
    .line 70
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void
    .line 74
    .line 75
    .line 76
.end method
