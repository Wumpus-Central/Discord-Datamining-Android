.class public Lcom/henninghall/date_picker/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/ReactPackage;


# static fields
.field public static a:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createNativeModules(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/NativeModule;",
            ">;"
        }
    .end annotation

    .line 1
    sput-object p1, Lcom/henninghall/date_picker/b;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [Lcom/facebook/react/bridge/NativeModule;

    .line 5
    .line 6
    new-instance v1, Lcom/henninghall/date_picker/DatePickerModule;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lcom/henninghall/date_picker/DatePickerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    aput-object v1, v0, p1

    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/facebook/react/uimanager/ViewManager;",
            ">;"
        }
    .end annotation

    .line 1
    sput-object p1, Lcom/henninghall/date_picker/b;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    new-array p1, p1, [Lcom/facebook/react/uimanager/ViewManager;

    .line 5
    .line 6
    new-instance v0, Lcom/henninghall/date_picker/DatePickerManager;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/henninghall/date_picker/DatePickerManager;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object v0, p1, v1

    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
